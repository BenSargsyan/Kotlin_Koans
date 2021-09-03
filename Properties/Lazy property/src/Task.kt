class LazyProperty(val initializer: () -> Int) {
    var x:Int?=null
    val lazy: Int
        get() {
            if(x==null)
            {
                x=initializer()
            }
                return x as Int
        }
}
