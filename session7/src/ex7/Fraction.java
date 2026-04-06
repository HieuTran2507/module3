package ex7;

public class Fraction {
    private int numerator;
    private int denominator;

    // Constructor
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Mẫu số không được bằng 0!");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify(); // luôn rút gọn ngay khi tạo
    }

    // Getter/Setter
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        simplify();
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Mẫu số không được bằng 0!");
        }
        this.denominator = denominator;
        simplify();
    }

    // GCD (ƯCLN)
    private int gcd(int a, int b) {
        if (b == 0) return Math.abs(a);
        return gcd(b, a % b);
    }

    // Rút gọn
    public void simplify() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;

        // chuẩn hóa dấu (mẫu luôn dương)
        if (denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
    }

    // Cộng
    public Fraction add(Fraction other) {
        int num = this.numerator * other.denominator +
                other.numerator * this.denominator;
        int den = this.denominator * other.denominator;
        return new Fraction(num, den);
    }

    // Trừ
    public Fraction subtract(Fraction other) {
        int num = this.numerator * other.denominator -
                other.numerator * this.denominator;
        int den = this.denominator * other.denominator;
        return new Fraction(num, den);
    }

    // Nhân
    public Fraction multiply(Fraction other) {
        int num = this.numerator * other.numerator;
        int den = this.denominator * other.denominator;
        return new Fraction(num, den);
    }

    // Chia
    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            throw new ArithmeticException("Không thể chia cho phân số = 0!");
        }
        int num = this.numerator * other.denominator;
        int den = this.denominator * other.numerator;
        return new Fraction(num, den);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
