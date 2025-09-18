public class Polynomial
{
    private double[] coefficients;

    public Polynomial()
    {
        coefficients = new double[]{0.0};
    }

    public Polynomial(double[] input_coefficients)
    {
        coefficients = input_coefficients;
    }
    
    public Polynomial add(Polynomial p2)
    {
        int len = Math.max(this.coefficients.length, p2.coefficients.length);
        double[] new_coefficients = new double[len];

        for(int i=0; i < len; i++)
        {
            double a = 0.0;
            double b = 0.0;
            if(i < this.coefficients.length) {
                a = this.coefficients[i];
            }
            if(i < p2.coefficients.length){
                b = p2.coefficients[i];
            }
            
            new_coefficients[i] = a + b;
        }
        return new Polynomial(new_coefficients);
    }

    public double evaluate(double x)
    {
        double sum = 0.0;
        for(int i=0; i < this.coefficients.length; i++){
            double ph = 0.0;
            ph = Math.pow(x, i);
            sum = sum + ph*this.coefficients[i];
        }
        return sum;
    }

    public boolean hasRoot(double x)
    {
        double sum = this.evaluate(x);
        if (sum == 0){
            return true;
        }
        else {
            return false;
        }
    } 
}