package practice.poi;

import java.io.IOException;
import java.text.ParseException;
import java.util.Collection;
import java.util.Set;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PoiController {

    @PostMapping("/document")
    public void updateContractDocument(@RequestBody Set<PropertyGroupResource> propertyGroupResources)
        throws IOException, InvalidFormatException, ParseException {
        GetDocFillFields.main(propertyGroupResources);
    }

//    @GetMapping("/properties")
//    public Collection<String> updateContractDocument() throws IOException, InvalidFormatException {
//        return GetDocFillFields.readProperties();
//    }

    /*@GetMapping("/properties")
    public Collection<PropertyGroupResource> updateContractDocument() throws IOException, InvalidFormatException {
        return PropertyGroupAssembler.toResources(GetDocFillFields.readProperties());
    }*/

}
