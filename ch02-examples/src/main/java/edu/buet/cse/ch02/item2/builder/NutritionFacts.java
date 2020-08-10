package edu.buet.cse.ch02.item2.builder;

public class NutritionFacts {
  private final int servingSize;
  private final int servings;
  private final int calories;
  private final int fat;
  private final int sodium;
  private final int carbohydrate;

  private NutritionFacts(Builder builder) {
    servingSize = builder.servingSize;
    servings = builder.servings;
    calories = builder.calories;
    fat = builder.fat;
    sodium = builder.sodium;
    carbohydrate = builder.carbohydrate;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("servingSize = ").append(servingSize).append("\n").append("servings = ")
        .append(servings).append("\n").append("calories = ").append(calories).append("\n")
        .append("fat = ").append(fat).append("\n").append("sodium = ").append(sodium).append("\n")
        .append("carbohydrate = ").append(carbohydrate).append("\n");

    return builder.toString();
  }

  public static class Builder {
    // the mandatory components
    private final int servingSize;
    private final int servings;

    // the optional components
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public Builder(int servingSize, int servings) {
      this.servingSize = servingSize;
      this.servings = servings;
    }

    public Builder calories(int val) {
      calories = val;
      return this;
    }

    public Builder fat(int val) {
      fat = val;
      return this;
    }

    public Builder sodium(int val) {
      sodium = val;
      return this;
    }

    public Builder carbohydrate(int val) {
      carbohydrate = val;
      return this;
    }

    public NutritionFacts build() {
      return new NutritionFacts(this);
    }
  }
}
