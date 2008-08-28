class Nomination implements Serializable {

    String name
    //String url
    int pageViews
    Date created = new Date()

    static constraints = {
        name(size: 6..30,nullable: false)
        //url(url: true, nullable: true)        
    }
    
    SortedSet fanBoys
    
    static hasMany = [ fanBoys : FanBoy ]

    static searchable = true

}
