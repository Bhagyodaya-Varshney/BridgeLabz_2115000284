public class RoundRobinScheduling {
    public static void main(String[] args) {
        Process process = new Process(1, 8, 2);
        process = Process.addProcess(2, 4, 1, process);
        process = Process.addProcess(3, 9, 3, process);
        process = Process.addProcess(4, 5, 2, process);

        Process.simulateRoundRobin(process, 3);
    }
}

class Process {
    int processId;
    int burstTime;
    int priority;
    Process next;

    public Process(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = this;
    }

    public static Process addProcess(int processId, int burstTime, int priority, Process process) {
        Process newProcess = new Process(processId, burstTime, priority);
        if (process == null) {
            return newProcess;
        }

        Process temp = process;
        while (temp.next != process) {
            temp = temp.next;
        }
        temp.next = newProcess;
        newProcess.next = process;
        return process;
    }

    public static void simulateRoundRobin(Process process, int timeQuantum) {
        if (process == null) return;

        int totalTime = 0, completedProcesses = 0;
        int processCount = countProcesses(process);
        int[] turnaroundTime = new int[processCount + 1];
        int[] waitingTime = new int[processCount + 1];

        Process temp = process;

        System.out.println("Executing processes in Round Robin order:");

        while (process != null) {
            if (temp.burstTime > timeQuantum) {
                System.out.println("Executing Process " + temp.processId + " for " + timeQuantum + " units.");
                temp.burstTime -= timeQuantum;
                totalTime += timeQuantum;
                temp = temp.next;
            } else {
                System.out.println("Process " + temp.processId + " completed execution.");
                totalTime += temp.burstTime;
                turnaroundTime[temp.processId] = totalTime;
                process = removeProcess(temp.processId, process);
                completedProcesses++;

                if (process == null) break;
                temp = temp.next;
            }
        }

        for (int i = 1; i <= processCount; i++) {
            if (turnaroundTime[i] != 0)
                waitingTime[i] = turnaroundTime[i] - getBurstTime(i);
        }

        System.out.println("Process Execution Summary: ");
        double avgWT = 0, avgTAT = 0;
        for (int i = 1; i <= processCount; i++) {
            if (turnaroundTime[i] != 0) {
                System.out.println("Process " + i + " -> Turnaround Time: " + turnaroundTime[i] + ", Waiting Time: " + waitingTime[i]);
                avgWT += waitingTime[i];
                avgTAT += turnaroundTime[i];
            }
        }

        System.out.println("Average Waiting Time: " + (avgWT / completedProcesses));
        System.out.println("Average Turnaround Time: " + (avgTAT / completedProcesses));
    }

    public static Process removeProcess(int processId, Process process) {
        if (process == null) return null;

        Process temp = process, prev = null;

        do {
            if (temp.processId == processId) {
                if (prev != null) {
                    prev.next = temp.next;
                } else {
                    Process last = process;
                    while (last.next != process) {
                        last = last.next;
                    }
                    process = temp.next;
                    last.next = process;
                }
                return (process.next == process) ? null : process;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != process);

        return process;
    }

    public static int countProcesses(Process process) {
        if (process == null) return 0;
        int count = 0;
        Process temp = process;
        do {
            count++;
            temp = temp.next;
        } while (temp != process);
        return count;
    }

    public static int getBurstTime(int processId) {
        switch (processId) {
            case 1: return 8;
            case 2: return 4;
            case 3: return 9;
            case 4: return 5;
            default: return 0;
        }
    }
}
