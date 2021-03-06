package chapter9;

/**
   A coin with a monetary value.
*/
public class Coin implements Measurable
{
   /**
      Constructs a coin.
      @param aValue the monetary value of the coin
      @param aName the name of the coin
   */
   public Coin(double aValue, String aName) 
   { 
      value = aValue; 
      name = aName;
   }

   /**
      Gets the coin value.
      @return the value
   */
   public double getValue() 
   {
      return value;
   }

   /**
      Gets the coin name.
      @return the name
   */
   public String getName() 
   {
      return name;
   }

   public double getMeasure() 
   {
      return value;
   }
   public String toString() {
	   return ""+value;
   }
   private double value;
   private String name;
@Override
public double getMaximum() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public double getMinimum() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public double getAverage() {
	// TODO Auto-generated method stub
	return 0;
}
}