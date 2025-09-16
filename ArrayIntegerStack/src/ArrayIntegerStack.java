public class ArrayIntegerStack implements IntegerStackInterface {

    public static final int CAPACITY = 1000;
    int[] stack;
    int currentSize = 0;

    public ArrayIntegerStack() {
        this.stack = new int[CAPACITY];
    }

    public ArrayIntegerStack(int size) {
        this.stack = new int[size];
    }

    /**
     * Devuelve el tamano de la pila. Es decir, el numero de elementos que se
     * encuentran en la pila.
     * [1, 2, 3] -> tiene tres elementos.
     * 
     * @return tamano de la pila
     */
    @Override
    public int size() {
        return this.currentSize;
    }

    /**
     * @return true si la pila esta vacia (no contiene elementos), false en otro
     *         caso.
     */
    @Override
    public boolean isEmpty() {
        return this.currentSize == 0;
    }

    /**
     * Devuelve el primer elemento de la pila, pero no lo elimina. Es decir, no
     * altera el contenido de la estructura.
     * 
     * @return el primer elemento de la pila (el que se devolveria al hacer pop()) o
     *         null si la pila esta vacia
     */
    @Override
    public Integer top() {
        if (!this.isEmpty()) {
            return this.stack[0];
        }
        return null;
    }

    /**
     * Anade un elemento a la pila. Si no hay espacio suficiente, no anade el
     * elemento y pinta un mensaje por pantalla para informar.
     * 
     * @param e
     */
    @Override
    public void push(Integer e) {
        if (this.currentSize >= CAPACITY) {
            System.err.println("No se puede aniadir el elemento. La pila esta llena.");
        } else {
            this.stack[this.currentSize] = e;
            this.currentSize++;
        }
    }

    /**
     * Devuelve el primer elemento de la pila y lo elimina de la misma.
     * 
     * @return el primer elemento de la pila (el que se devolveria al hacer pop()) o
     *         null si la pila esta vacia
     */
    @Override
    public Integer pop() {
        if (!this.isEmpty()) {
            int elemento = this.stack[0];
            for (int i = 0; i < this.currentSize - 1; i++) {
                this.stack[i] = this.stack[i + 1];
            }
            this.currentSize--;
            return elemento;
        }
        return null;
    }

    /**
     * Devuelve una cadena representado el contenido de la pila.
     * Si a una pila se le han anadido los elementos 1, 2 y 3, en ese orden,
     * entonces la cadena resultante en este metodo sera la siguiente: "[1, 2, 3]".
     * 
     * @return una cadena de texto representando el contenido de la pila.
     */
    public String toString() {
        if (this.isEmpty()) {
            return "[]";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i < this.currentSize - 1; i++) {
                sb.append(this.stack[i]);
                sb.append(", ");
            }
            sb.append(this.stack[this.currentSize - 1]);
            sb.append("]");
            return sb.toString();
        }
    }
}
