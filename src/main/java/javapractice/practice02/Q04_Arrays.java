package javapractice.practice02;



    public class Q04_Arrays {
        public static void main(String[] args) {

            //  Create a String array, add 5 elements in it,
            // find the sum of the number of the characters in all Strings.
            String[] countries = {"Turkey", "United States", "Russia", "Sweden", "Japan"};

            // For
            int sum = 0;
            for (int i=0; i<countries.length; i++){
                sum+=countries[i].length();
            }
            System.out.println(sum);

            // For-Each
            int total=0;
            for(String country: countries){
                total+=country.length();
            }
            System.out.println(total);

        }
    }


