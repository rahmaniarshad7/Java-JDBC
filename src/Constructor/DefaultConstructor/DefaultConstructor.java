package Constructor.DefaultConstructor;

import static java.lang.StringTemplate.STR;

public class DefaultConstructor {

    int bedrooms;
    int bathrooms;
    String kitchentypes;

    DefaultConstructor(){
        bedrooms = 2;
        bathrooms = 4;
        kitchentypes = "Standard";
    }
    void Showdata(){
        System.out.println(STR."Bedrooms: \{bedrooms}");
        System.out.println(STR."Bathrooms: \{bathrooms}");
        System.out.println(STR."Kitchentypes: \{kitchentypes}");
        
    }

    public static void main(String[] args) {
        DefaultConstructor house = new DefaultConstructor();
        house.Showdata();
    }
}
