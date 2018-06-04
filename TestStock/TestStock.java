//Grayum

//April 11, 2017

//Homework Assignment 9.2

public class TestStock{
   public static void main(String[] args){
   
      Stock stock = new Stock("ORCL", "Oracle Corporation");
      
      stock.setPreviousClosingPrice(34.5);
      stock.setCurrentPrice(34.35);
      
      double change = stock.getChangePercent();
      
      String direction = "up";
      if(change < 0) direction = "down";
    
      System.out.printf("\n" + stock.getSymbol() + " is " + direction + 
                        " %.2f%% today.\n", Math.abs(change));
   }
}

class Stock{
   private String symbol;
   private String name;
   private double previousClosingPrice;
   private double currentPrice;
   
   public Stock(String stockSymbol, String stockName){
      symbol = stockSymbol;
      name = stockName;
   }
   public void setPreviousClosingPrice(double price){
      previousClosingPrice = price;
   }
   public void setCurrentPrice(double price){
      currentPrice = price;
   }
   public double getPreviousClosingPrice(){
      return previousClosingPrice;
   }
   public double getCurrentPrice(){
      return currentPrice;
   }
   public String getSymbol(){
      return symbol;
   }
   public String getName(){
      return name;
   }
   public double getChangePercent(){
      return 100 * ((currentPrice - previousClosingPrice)/previousClosingPrice);
   }
}