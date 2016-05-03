package gamereview

class Game {

	String name
	String description
	Double price

	static hasMany= [reviews: Review]

    static constraints = {
    }
}
