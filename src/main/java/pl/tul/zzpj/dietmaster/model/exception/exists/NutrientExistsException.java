package pl.tul.zzpj.dietmaster.model.exception.exists;

import pl.tul.zzpj.dietmaster.model.exception.AppBaseException;

public class NutrientExistsException extends AppBaseException {

    private static final String NUTRIENT_EXISTS = "Nutrient %s already exists in the database.";

    public NutrientExistsException(String name) {
        super(String.format(NUTRIENT_EXISTS, name));
    }

    @Override
    public String getCode() {
        return super.getCode() + "_diet_exists";
    }

}
