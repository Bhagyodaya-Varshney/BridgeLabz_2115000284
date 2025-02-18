import java.util.*;

class Personalized_Meal_Plan{
	public static void main(String[]args){
		Meal<VegetarianMeal> vm = new Meal<>();
        vm.add(new VegetarianMeal("Tandoori Naan"));
        vm.add(new VegetarianMeal("Paneer Tandoori"));

        Meal<VeganMeal> vem = new Meal<>();
        vem.add(new VeganMeal("ABCD"));
        vem.add(new VeganMeal("DEF"));

        Meal<KetoMeal> km = new Meal<>();
        km.add(new KetoMeal("GHI"));
        km.add(new KetoMeal("JKL"));

        Meal<HighProteinMeal> hm = new Meal<>();
        hm.add(new HighProteinMeal("MNO"));
        hm.add(new HighProteinMeal("PQR"));

        System.out.println("Vegetarian Meal Plan:");
        Meal.displayMeal(vm.getMealList());

        System.out.println("Vegan Meal Plan:");
        Meal.displayMeal(vem.getMealList());

        System.out.println("Keto Meal Plan:");
        Meal.displayMeal(km.getMealList());

        System.out.println("High Protein Meal Plan:");
        Meal.displayMeal(hm.getMealList());
	}
}
interface MealPlan{
	String getMealName();
}

class VegetarianMeal implements MealPlan{
	private String mealName;
	VegetarianMeal(String mealName){
		this.mealName = mealName;
	}
	
	public String getMealName(){
		return mealName;
	} 
}
class VeganMeal implements MealPlan{
	private String mealName;
	VeganMeal(String mealName){
		this.mealName = mealName;
	}
	
	public String getMealName(){
		return mealName;
	} 
}
class KetoMeal implements MealPlan{
	private String mealName;
	KetoMeal(String mealName){
		this.mealName = mealName;
	}
	
	public String getMealName(){
		return mealName;
	} 
}
class HighProteinMeal implements MealPlan{
	private String mealName;
	HighProteinMeal(String mealName){
		this.mealName = mealName;
	}
	
	public String getMealName(){
		return mealName;
	} 
}
class Meal<T extends MealPlan>{
	private List<T> mealList = new ArrayList<>();
	void add(T meal){
		mealList.add(meal);
	}
	List<T> getMealList(){
		return mealList;
	}
	public static void displayMeal(List<? extends MealPlan> meallist){
		for(MealPlan mp : meallist)
			System.out.println("Meal: "+mp.getMealName());
	}
}