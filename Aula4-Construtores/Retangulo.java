public class Retangulo {
        private float base;
        private float altura;
        
        public Retangulo() {
            base = 1;
            altura = 2;
        }
        
        public Retangulo(float base, float altura) {
            this.base = base;
            this.altura = altura;
        }

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
