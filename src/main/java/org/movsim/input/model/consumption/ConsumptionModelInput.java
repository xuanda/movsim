package org.movsim.input.model.consumption;

import java.util.Map;

import org.jdom.Element;
import org.movsim.input.XmlElementNames;
import org.movsim.input.impl.XmlUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConsumptionModelInput {

    /** The Constant logger. */
    final static Logger logger = LoggerFactory.getLogger(ConsumptionModelInput.class);

    private ConsumptionCarModelInput carData;

    private ConsumptionEngineModelInput engineData;

    private String label;

    public ConsumptionModelInput(Element elem) {

        this.label = elem.getAttributeValue("label");

        final Map<String, String> carDataMap = XmlUtils.putAttributesInHash(elem.getChild(XmlElementNames.ConsumptionCarData));
        carData = new ConsumptionCarModelInput(carDataMap);

        engineData = new ConsumptionEngineModelInput(elem.getChild(XmlElementNames.ConsumptionEngineData));

    }

    public ConsumptionCarModelInput getCarData() {
        return carData;
    }

    public ConsumptionEngineModelInput getEngineData() {
        return engineData;
    }

    public String getLabel() {
        return label;
    }

}