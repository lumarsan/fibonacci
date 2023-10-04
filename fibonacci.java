public class Fibonacci {
    public static void main(String[] args) {
        int cantidad = 8;
        fibonacci1(cantidad);
        System.out.println();
        fibonacci2(cantidad);
        System.out.println();
        fibonacci3(cantidad);
        System.out.println();
    }

    // Utilizamos el bucle for

    public static void fibonacci1(int cantidad) {
        int v0 = 0;
        int v1 = 1;
        System.out.print(v0 + ", ");
        System.out.print(v1 + ", ");
        for (int i = 0; i < cantidad; i++) {
            int vn = v1 + v0;
            v0 = v1;
            v1 = vn;
            System.out.print(vn + ", ");
        }
    }

    public static void fibonacci2(int cantidad) {
        int v0 = 0;
        int v1 = 1;
        int i = 0;
        System.out.print(v0 + ", ");
        System.out.print(v1 + ", ");
        while (i < cantidad) {
            int vn = v1 + v0;
            v0 = v1;
            v1 = vn;
            System.out.print(vn + ", ");
            i++;
        }
    }

    public static void fibonacci3(int cantidad) {
        int v0 = 0;
        int v1 = 1;
        int i = 0;
		System.out.print(v0 + ", ");
        System.out.print(v1 + ", ");
        do {
            int vn = v1 + v0;
            v0 = v1;
            v1 = vn;
            System.out.print(vn + ", ");
            i++;
        } while (i < cantidad);
    }
}
