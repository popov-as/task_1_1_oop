public class Triangle
{
    float sideA;
    float sideB;
    float sideC;

    public Triangle(float sideA, float sideB, float sideC)
    {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    private float getHeight(float side)
    {
        // Сначала назвал semiperimeter, потом переименовал в p
        float p = (sideA + sideB + sideC) / 2;
        return 2 / side * (float) Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    public float getHeightA()
    {
        return getHeight(sideA);
    }

    public float getHeightB()
    {
        return getHeight(sideB);
    }

    public float getHeightC()
    {
        return getHeight(sideC);
    }
}
