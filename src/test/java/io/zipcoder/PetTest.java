package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

public class PetTest {
    @Test
    public void sortPetsTypeNameTest(){
        Cat cat0 = new Cat("Mitty");
        Dog dog1 = new Dog("Luna");
        Fox fox2 = new Fox("Leonard");
        Pet [] myPets = new Pet[]{cat0, dog1, fox2};
        Pet[] expected = new Pet[]{cat0, dog1, fox2};
        Pet[] actual = Pet.sortPetsTypeName(myPets);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void compareToTest(){
        Cat cat0 = new Cat("Zoe");
        Dog dog1 = new Dog("Davis");
        Cat cat1 = new Cat("Cedric");
        Assert.assertTrue(cat1.compareTo(dog1) < 0 );
        Assert.assertTrue(dog1.compareTo(cat0) < 0);
    }
}
