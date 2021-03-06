package flavor.pie.boop;

import com.google.common.collect.Lists;
import com.google.common.reflect.TypeToken;
import ninja.leaping.configurate.objectmapping.Setting;
import ninja.leaping.configurate.objectmapping.serialize.ConfigSerializable;
import org.spongepowered.api.effect.sound.SoundType;
import org.spongepowered.api.text.format.TextColor;

import java.util.List;

@ConfigSerializable
public class Config {
    public final static TypeToken<Config> type = TypeToken.of(Config.class);
    @Setting public String prefix;
    @Setting public Name name;
    @Setting public Sound sound;
    @Setting public Message message;
    @Setting public List<String> groups;
    @ConfigSerializable
    public static class Name {
        @Setting public boolean recolor;
        @Setting public TextColor color;
    }
    @ConfigSerializable
    public static class Message {
        @Setting public boolean recolor;
        @Setting public TextColor color;
    }
    @ConfigSerializable
    public static class Sound {
        @Setting public boolean play;
        @Setting public SoundType sound;
    }
}
