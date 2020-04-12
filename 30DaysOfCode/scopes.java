/**
 * scopes
 */
public class scopes {

    class Difference {
        private int[] elements;
        public int maximumDifference;

        // Add your code here
        public Difference(int[] elements) {
            this.elements = elements;
        }

        public void computeDifference() {
            int min = this.elements[0];
            int max = this.elements[0];

            for (int i = 0; i < this.elements.length; i++) {
                if (this.elements[i] < min) {
                    min = this.elements[i];
                }

                if (this.elements[i] > max) {
                    max = this.elements[i];
                }
            }

            this.maximumDifference = Math.abs(max - min);
        }

    } // End of Difference class

}
