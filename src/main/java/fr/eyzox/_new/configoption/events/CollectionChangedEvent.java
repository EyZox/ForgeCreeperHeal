package fr.eyzox._new.configoption.events;

import java.util.Collection;

import fr.eyzox._new.configoption.ConfigOptionCollection;

public class CollectionChangedEvent<T> extends AbstractCollectionChangedEvent<Collection<T>> {

    private final Collection<T> collection;
    private final T value;

    public CollectionChangedEvent(ConfigOptionCollection<T> config, Collection<T> collection, T newValue, State state) {
        super(config, state);
        this.value = newValue;
        this.collection = collection;
    }

    public Collection<T> getCollection() {
        return collection;
    }

    public T getValue() {
        return value;
    }
}