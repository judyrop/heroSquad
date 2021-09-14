import java.util.ArrayList;
import java.util.List;
public class Squad {
       private  String mName;
        private String mCause;
        private String mSize;
        private static List<Squad> instances = new ArrayList<>();
        private int mid;
        private ArrayList<Hero>mHeroes;

        public Squad(String name ,String cause, String size) {
            this.mName = name;
            this.mCause = cause;
            this.mSize = size;
            instances.add(this);
            mid = instances.size();
            mHeroes = new ArrayList<Hero>();

        }


        public String getName() {
            return mName;
        }

        public String getCause() {
            return mCause;
        }

        public String getSize() {
            return mSize;
        }

        public static ArrayList<Squad> all() {

            return (ArrayList<Squad>) instances;
        }

        public int getmId() {
            return mid;
        }

        public static Squad find(int id){
            return instances.get(id -1);
        }

        public ArrayList<Hero> getHeroes(){
            return mHeroes;
        }

        public void addHero(Hero hero) {
            mHeroes.add(hero);
        }


}
