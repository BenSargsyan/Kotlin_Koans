import java.util.HashMap
import javax.swing.UIManager.put

fun  <K,V> buildMap(builder:HashMap<K,V>.() -> Unit):HashMap<K,V>
{
    var map=HashMap<K,V>()
    map.builder()
    return map
}

fun usage(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
