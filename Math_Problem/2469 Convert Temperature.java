class Solution {
    public double[] convertTemperature(double celsius) 
    {
        double x[]=new double[2];
        x[0] = celsius + 273.15;
        x[1] = celsius * 1.80 + 32.00;
        return x;
    }
}
