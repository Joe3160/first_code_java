package chapter4.demo478;

public class PetShop {
    private Link pets = new Link();

    public void add(Pet pet) {
        this.pets.add(pet);
    }

    public void delete(Pet pet) {
        this.pets.remove(pet);
    }

    public Object[] getPets(){
        return this.pets.toArray();
    }

    public Link search(String keyword) {
        Link result = new Link();
        Object[] obj = this.pets.toArray();
        for (int i = 0; i < obj.length; i++) {
            Pet p = (Pet) obj[i];
            if (p.getName().contains(keyword)) {
                result.add(p);
            }
        }
        return result;
    }
}
