package org.example.factory;

import org.example.interfaces.*;
import org.example.models.*;

import javax.imageio.plugins.tiff.TIFFDirectory;
import java.lang.reflect.Array;

public class AnimalFactory {
    public static IAnimal getAnimal(Object obj)
    {
        if(obj == null)
            return null;

        if(obj.getClass() == Lion.class)
            return (Lion)obj;

        if(obj.getClass() == Tiger.class)
            return (Tiger)obj;

        if(obj.getClass() == Zebra.class)
            return (Zebra)obj;

        if(obj.getClass() == Donkey.class)
            return (Donkey)obj;

        if(obj.getClass() == Horse.class)
            return (Horse)obj;

        if(obj.getClass() == Liger.class)
            return (Liger)obj;

        if(obj.getClass() == Mule.class)
            return (Mule)obj;

        return null;
    }

    public static IAnimal[] getAnimalArray(Object obj, int size)
    {
        if(obj == null)
            return null;

        if(obj.getClass() == Lion.class)
            return (Lion[]) Array.newInstance(obj.getClass(), size);

        if(obj.getClass() == Tiger.class)
            return (Tiger[]) Array.newInstance(obj.getClass(), size);

        if(obj.getClass() == Zebra.class)
            return (Zebra[]) Array.newInstance(obj.getClass(), size);

        if(obj.getClass() == Donkey.class)
            return (Donkey[]) Array.newInstance(obj.getClass(), size);

        if(obj.getClass() == Horse.class)
            return (Horse[]) Array.newInstance(obj.getClass(), size);

        if(obj.getClass() == Liger.class)
            return (Liger[]) Array.newInstance(obj.getClass(), size);

        if(obj.getClass() == Mule.class)
            return (Mule[]) Array.newInstance(obj.getClass(), size);

        return null;
    }
}
