class Demands {
    val body: ArrayList<Demand> = arrayListOf()

    fun add(demand: Demand){
        body.add(demand)
    }

    override fun toString(): String {
        return body.toString()
    }

    fun getMaxPathsCount(): Int{
        var max = 0
        for(item in body) {
            if (item.paths.size > max) {
                max = item.paths.size
            }
        }
        return max
    }

    fun size() :Int {
        return body.size
    }
}