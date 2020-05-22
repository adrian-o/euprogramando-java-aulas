package app.tipos;

public class Primitivos {

    byte mb = 127; // 1 byte = 8 bits 2^8 | -128 à 127
    short ms = -32768;  // 2 bytes = 16 bits 2^16 | -32768 à 32767
    int mi = -2147483648; // 4 bytes = 32 bits 2^32 | -2147483648 à 2147483647 
    long ml = 9223372036854775807L; // 8 bytes = 64 bits 2^64

    int mInt = 0;
    boolean mBool = true;
    char mChar = 'M';
    float mF = 1.0f;
    double mD = 1.0;

    public static void main(String[] args) {
        System.out.println("Soma Bin + OCT + Hex: " + (0b1010 + 012 + 0xA));
    }
}

// 0[0] 1[0] 2[0] 3[0] 4[0] 5[0] 6[0] 7[1]