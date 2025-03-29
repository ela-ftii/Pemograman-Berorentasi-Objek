public class NumberDisplay {
    private int limit;
    private int value;

    public NumberDisplay(int rollOverLimit) {
        limit = rollOverLimit;
        value = 0;
    }

    public int getValue(){
        return value;
    }

    // mengatur nilai value ke replacement jika nilai terseb dalam rentang 0 dan limit
    public void setValue(int replacementValue){
        if(replacementValue >= 0 && replacementValue < limit)
            value = replacementValue;
    }

    /*
     * mengatur nilai value ke replacement jika nilai terseb dalam rentang 0 dan limit
     * jika valuenya kurang dari 10, maka akan ditambahkan
     * angka nol di depan untuk memastikan format 2 digit
    */
    public String getDisplayValue(){
        if(value<10){
            return "0"+value;
        }
        else{
            return ""+value;
        }
    }

    /*
     * metode ini menambah value sebesar 1 dan menggunakan
     * operator modulus untuk memastikan value mancapati limit,
     * ia akan kembali ke 0
    */
    public void increment(){
        value = (value + 1) % limit;
    }

}