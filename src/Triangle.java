public class Triangle
{
    private float sideA;
    private float sideB;
    private float sideC;

    public Triangle(float sideA, float sideB, float sideC)
    {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0)
            throw new IllegalArgumentException("Длина каждой стороны должна быть больше нуля");

        if (sideA > (sideB + sideC) || sideB > (sideA + sideC) || sideC > (sideA + sideB))
            throw new IllegalArgumentException("Стороны не могут быть треугольником");

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
