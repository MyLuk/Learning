package yaml;

import org.yaml.snakeyaml.TypeDescription;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.Map;

public class YamlTest  {

    public static void main(String[] args) throws FileNotFoundException {
//        use Class Customer in constructor
//        Constructor constructor = new Constructor(Customer.class);
//        TypeDescription customTypeDescription = new TypeDescription(Customer.class);
//        customTypeDescription.addPropertyParameters("contactDetails", Contact.class);
//        constructor.addTypeDescription(customTypeDescription);
//        Yaml yaml = new Yaml(constructor);
        Yaml yaml = new Yaml();
        InputStream inputStream = new FileInputStream("/home/michael/IdeaProjects/gs-rest-service/Learning/src/main/java/yaml/customer.yaml");
        Customer obj = yaml.load(inputStream);
        System.out.println(obj);
        Yaml yaml1 = new Yaml();
        Map<Object, Object> document = yaml1.load("3.0: 2018-07-22");
        System.out.println();
//        dump in String
        Map<String, Object> data = new LinkedHashMap<String, Object>();
        data.put("name", "Silenthand Olleander");
        data.put("race", "Human");
        data.put("traits", new String[] { "ONE_HAND", "ONE_EYE" });
        Yaml yaml2 = new Yaml();
        StringWriter writer = new StringWriter();
        yaml.dump(data, writer);
        System.out.println(writer.toString());
//        dump in java object
        Customer customer = new Customer();
        customer.setAge(45);
        customer.setFirstName("Greg");
        customer.setLastName("McDowell");
        Yaml yaml3 = new Yaml();
        StringWriter writer1 = new StringWriter();
        yaml.dump(customer, writer1);
        System.out.println(writer1.toString());

    }


}
