class CircularPump{
	public static int indexOfStartPetrolPump(int[] petrol, int[] distance) {
        int petrolTotal = 0, distanceTotal = 0, startPump = 0, fuel = 0;

        for (int i = 0; i < petrol.length; i++) {
            petrolTotal += petrol[i];
            distanceTotal += distance[i];
            fuel = fuel + (petrol[i] - distance[i]);

            if (fuel < 0) {  
                startPump = i + 1;
                fuel = 0;
            }
        }
        return (petrolTotal >= distanceTotal) ? startPump : -1;
    }
	public static void main(String[]args){
		int []petrol = {4, 6, 7, 4};
		int []distance = {6, 5, 3, 5};
		
		int i = indexOfStartPetrolPump(petrol,distance);
		System.out.println(i);
	}
}