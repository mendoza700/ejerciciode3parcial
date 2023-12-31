package ejercicio3_7;
import java.util.Scanner;
public class Estudiante {
        private String nombre;
        private String apellidos;
        private int codigo;
        private int numeroSemestre;
        private double notaFinal;

        public Estudiante() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el nombre del estudiante: ");
            this.nombre = scanner.nextLine();
            System.out.print("Ingrese los apellidos del estudiante: ");
            this.apellidos = scanner.nextLine();
            System.out.print("Ingrese el código del estudiante: ");
            this.codigo = scanner.nextInt();
            System.out.print("Ingrese el número de semestre del estudiante: ");
            this.numeroSemestre = scanner.nextInt();
            System.out.print("Ingrese la nota final del estudiante: ");
            this.notaFinal = scanner.nextDouble();
        }

        public int getCodigo() {
            return codigo;
        }

        public void mostrarInformacion() {
            System.out.println("Nombre: " + nombre + " " + apellidos);
            System.out.println("Código: " + codigo);
            System.out.println("Número de Semestre: " + numeroSemestre);
            System.out.println("Nota Final: " + notaFinal);
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellidos() {
            return apellidos;
        }

        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }

        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }

        public int getNumeroSemestre() {
            return numeroSemestre;
        }

        public void setNumeroSemestre(int numeroSemestre) {
            this.numeroSemestre = numeroSemestre;
        }

        public double getNotaFinal() {
            return notaFinal;
        }

        public void setNotaFinal(double notaFinal) {
            this.notaFinal = notaFinal;
        }
    }

