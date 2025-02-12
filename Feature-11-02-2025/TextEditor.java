class TextEditor{
    public static void main(String[] args) {
        TextState editor = new TextState();
        
        editor.addState("Hii");
        editor.addState("Hii, I am");
        editor.addState("Hii, I am Bhagyodaya Varshney");
        
        editor.displayCurrentState();
        
        editor.undo();
        editor.displayCurrentState();
        
        editor.undo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();

        editor.undo();
        editor.undo();
        editor.undo();

        editor.redo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();
    }
}

class TextState {
    private TextState head, current;
    private String text;
    private TextState next, prev;
    private int history = 0;
    private final int maxHistory = 10;

    public TextState() {
        this.text = "";
        this.next = null;
    }

    public void addState(String text) {
        TextState newState = new TextState();
        newState.text = text;

        if (current == null)
            head = current = newState;
        else {
            current.next = null;
            newState.prev = current;
            current.next = newState;
            current = newState;

            history++;
            if (history > maxHistory) {
                head = head.next;
                head.prev = null;
                history--;
            }
        }
    }

    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("Undo not possible.");
        }
    }

    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("Redo not possible.");
        }
    }

    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current Text: " + current.text);
        } else {
            System.out.println("No text available.");
        }
    }
}
