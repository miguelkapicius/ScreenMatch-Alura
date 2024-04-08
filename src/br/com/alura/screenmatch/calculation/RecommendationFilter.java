package br.com.alura.screenmatch.calculation;

public class RecommendationFilter {

    public void filter(Classifiable classifiable) {
        if (classifiable.getClassification() >= 4) {
            System.out.println("favorites of the moment!");
        } else if (classifiable.getClassification() >= 2){
            System.out.println("Well rated!");
        } else  {
            System.out.println("Watch later...");
        }
    }
}
