package skeletony007;

import java.util.HashMap;

/**
 * Inspired by Guava's BiMap.
 *
 * @see <a href="https://github.com/google/guava/wiki/NewCollectionTypesExplained#bimap">Guava's BiMap</a>
 */

public class BiMap<K, V> {
    private HashMap<K, V> forwardMap;
    private HashMap<V, K> backwardMap;

    public BiMap() {
        this.forwardMap = new HashMap<>();
        this.backwardMap = new HashMap<>();
    }

    public BiMap(int size) {
        this.forwardMap = new HashMap<>(size);
        this.backwardMap = new HashMap<>(size);
    }

    public V get(K key) {
        return this.forwardMap.get(key);
    }

    public K inverse(V value) {
        return this.backwardMap.get(value);
    }

    public void put(K key, V value) {
        this.forwardMap.put(key, value);
        this.backwardMap.put(value, key);
    }
}
