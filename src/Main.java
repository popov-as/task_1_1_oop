import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        float sideA = readTriangleSide("A", scanner);
        float sideB = readTriangleSide("B", scanner);
        float sideC = readTriangleSide("C", scanner);

        Triangle triangle = new Triangle(sideA, sideB, sideC);

        printTriangleHeight("A", triangle.getHeightA());
        printTriangleHeight("B", triangle.getHeightB());
        printTriangleHeight("C", triangle.getHeightC());
    }

    /**
     * Ввод стороны треугольника
     */
    private static float readTriangleSide(String sideName, Scanner scanner)
    {
        System.out.printf("Введите длину стороны %s треугольника: ", sideName);
        float side = scanner.nextFloat();

        if (side <= 0) throw new IllegalArgumentException("Длина должна быть больше нуля");

        return side;
    }

    /**
     * Вывод высоты треугольника
     */
    private static void printTriangleHeight(String sideName, float height)
    {
        System.out.printf("Высота стороны %s: %.3f\n", sideName, height);
    }
}