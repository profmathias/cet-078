public class Retangulo {
        private float base;
        private float altura;

        public float calcularArea() {
                return base*altura;
        }

        public float calcularPerimetro() {
                return 2*base + 2*altura;
        }

        public void imprimir() {
                System.out.println("A Altura é " + altura + ", a base é " + base);
        }

        public void setBaseEAltura(float b, float a) {
                base = b;
                altura = a;
        }
}
