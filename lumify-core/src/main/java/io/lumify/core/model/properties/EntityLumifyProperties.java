package io.lumify.core.model.properties;

import io.lumify.core.model.properties.types.IdentityLumifyProperty;
import io.lumify.core.model.properties.types.TextLumifyProperty;
import org.securegraph.TextIndexHint;
import org.securegraph.type.GeoPoint;

/**
 * LumifyProperties that apply to both raw and resolved entities stored in the Lumify system.
 */
public class EntityLumifyProperties {
    public static final IdentityLumifyProperty<GeoPoint> GEO_LOCATION = new IdentityLumifyProperty<GeoPoint>("http://lumify.io/dev#geolocation");
    public static final TextLumifyProperty SOURCE = TextLumifyProperty.all("http://lumify.io#source");
    public static final TextLumifyProperty IMAGE_VERTEX_ID = new TextLumifyProperty("http://lumify.io#entityImageVertexId", TextIndexHint.NONE);

    private EntityLumifyProperties() {
        throw new UnsupportedOperationException("do not construct utility class");
    }
}
