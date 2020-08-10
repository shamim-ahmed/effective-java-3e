package edu.buet.cse.ch02.item2.builder;

public class NutritionFactsTrial {
  public static void main(String... args) {
    NutritionFacts facts = new NutritionFacts.Builder(2, 4).calories(200).carbohydrate(100).build();

    System.out.println(facts);
  }
}
