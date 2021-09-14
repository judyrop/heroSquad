import java.util.ArrayList;
public class Hero {

        private String mName;
        private int mAge;
        private String mPower;
        private String mWeakness;
        private static ArrayList<Hero> instances = new ArrayList<>();
        private int id ;

        public Hero (String name, int age, String power, String weakness){
            mName = name;
            mAge =  age;
            mPower = power;
            mWeakness = weakness;
            instances.add(this);
            id = instances.size();

        }

        public String getName() {
            return mName;
        }


        public int getAge() {
            return mAge;
        }

        public String getPower() {
            return mPower;
        }

        public String getWeakness() {
            return mWeakness;
        }

        public static ArrayList<Hero> all() {
            return instances;
        }

        public static void clear(){
            instances.clear();
        }

        public int getmId() {
            return id;
        }
        public static Hero find(int id) {
            return instances.get(id - 1);
        }


}
