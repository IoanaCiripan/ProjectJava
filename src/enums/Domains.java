package enums;

public enum Domains {
        INFORMATICA(0),
        MATEMATICA(1),
        LITERATURA(2),
        FIZICA(3),
        MECANICA(4);

        private Integer value;


         Domains(Integer value){
           this.value = value;
        }


         public static Domains fromValue(int value) throws IllegalArgumentException {
                try {
                    return Domains.values()[value];
                } catch(ArrayIndexOutOfBoundsException e) {
                throw new IllegalArgumentException("Unknown enum value :"+ value);
        }
    }







}
