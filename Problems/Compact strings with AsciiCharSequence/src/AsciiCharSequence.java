public class AsciiCharSequence /* extends/implements */ implements CharSequence {
    byte[]myArray;
    public AsciiCharSequence(byte[]myArray) {
        this.myArray = myArray.clone();
    }
    @Override
    public int length() {
        return myArray.length;
    }

    @Override
    public char charAt(int index) {
        return (char) myArray[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        /*int l = end - start;
        byte[]myArraySub = new byte[l];
        return new CharSequence(System.arraycopy(myArray,start,myArraySub,0,l));*/
        return new AsciiCharSequence(java.util.Arrays.copyOfRange(myArray, start, end));
    }

    @Override
    public String toString() {
        return new String(this.myArray);
    }

    // implementation
}