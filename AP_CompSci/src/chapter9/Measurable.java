package chapter9;

/**
   Describes any class whose objects can be measured.
*/
public interface Measurable
{
   /**
      Computes the measure of the object.
      @return the measure
   */
   double getMeasure();
   double getMaximum();
   double getMinimum();
   double getAverage();
}