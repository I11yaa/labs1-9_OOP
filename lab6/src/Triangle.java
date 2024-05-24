class Triangle {
    double cathetus1;
    double cathetus2;

    public Triangle(double cathetus1, double cathetus2) {
        this.cathetus1 = cathetus1;
        this.cathetus2 = cathetus2;
    }

    double calculateSin() {
        return cathetus1 / Math.sqrt(cathetus1 * cathetus1 + cathetus2 * cathetus2);
    }

    double calculateCos() {
        return cathetus2 / Math.sqrt(cathetus1 * cathetus1 + cathetus2 * cathetus2);
    }

    double calculateTan() {
        return cathetus1 / cathetus2;
    }
}
