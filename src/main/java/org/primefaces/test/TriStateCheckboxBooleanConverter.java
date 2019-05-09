package org.primefaces.test;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;
import java.io.Serializable;


@Named
@ApplicationScoped
@FacesConverter("triStateCheckboxBooleanConverter")
public class TriStateCheckboxBooleanConverter implements Serializable, Converter {      // removed generic <Boolean>

    public TriStateCheckboxBooleanConverter() {
        System.out.println("new instance TriStateCheckboxBooleanConverter");
    }

    @Override
    public Boolean getAsObject(FacesContext context, UIComponent component, String value) {
        int i = 1; // debug break point

        System.out.println("converter getAsObject called: " + value);

        switch (value) {
            case "0": {
                return null;
            }
            case "1": {
                return true;
            }
            case "2": {
                return false;
            }
            default: {
                throw new IllegalArgumentException("value not convertable: " + value);
            }
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        int i = 1; // debug break point
        System.out.println("converter getAsString called: " + value + " - " + value.getClass().getName());

        if (value == null) {
            return "0";
        }

        Boolean bValue = (Boolean) value;
        return (bValue ? "1" : "2");
    }
}
