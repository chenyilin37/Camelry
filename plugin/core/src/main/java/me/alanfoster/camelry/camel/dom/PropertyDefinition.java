//
// Note - This file was automatically generated
// Generation spawned by 'class me.alanfoster.camelry.codegen.ScalateGenerator$'
// Creation Date - 16 August 2013
// Please do not manually modify this class.
//
package me.alanfoster.camelry.camel.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.*;
import java.util.List;


/**
 * @author Alan
 */
//@SubTag("property")
public interface PropertyDefinition extends DomElement  {
            
        @Required
                @NotNull
        @Attribute("key")
        GenericAttributeValue<String> getKey();
            
        @Required
                @NotNull
        @Attribute("value")
        GenericAttributeValue<String> getValue();
    
    
    }