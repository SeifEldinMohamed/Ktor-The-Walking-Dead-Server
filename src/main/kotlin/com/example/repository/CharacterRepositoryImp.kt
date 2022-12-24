package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Character

const val NEXT_PAGE_KEY = "nextPage"
const val PREV_PAGE_KEY = "prevPage"

class CharacterRepositoryImp : CharacterRepository {
    override val characters: Map<Int, List<Character>> by lazy {
        mapOf(
            1 to page1,
            2 to page2,
            3 to page3,
            4 to page4,
            5 to page5,
        )
    }

    override val page1: List<Character> = listOf(
        Character(
            id = 1,
            name = "Rick Grimes",
            realName = "Andrew Lincoln",
            about = "At the end of last season, Rick unexpectedly let Negan live, and he stands by this decision in the name of his son. His goal is not simply to survive, it’s to build the future Carl envisioned for this post post-apocalyptic world. He is determined to see this through, but he’s no longer the only voice of leadership, and not everyone agrees on the path forward. The war may be over, but the struggle for peace is just beginning.",
            totalAppearances = 111,
            image = "images/rick.jpg",
            quote = "They're gonna feel pretty stupid when they find out... they're scrrewing with the wrong people.",
            quoteTime = "RICK, SEASON 4, EPISODE 16",
            rating = 5.0,
        ),
        Character(
            id = 2,
            name = "Michonne Grimes",
            realName = "Danai Gurira",
            about = "Michonne continues to be the strong strategic thinker she has been since before the post-apocalyptic world. Her pendulum has swung from staunchly independent to a pessimistic protector to having faith in humanity, but always squarely grounded in what is for the greater good and safety of her family and the communities. Michonne innately knows Alpha has all the power and that they must abide by her rules, for now, because revenge will get everyone killed. Michonne wants to dismantle Alpha’s power. She is teaching Judith how to strategically attack an enemy. She must equip her daughter and her son for their future in this dead world.",
            totalAppearances = 96,
            image = "images/michone.jpg",
            quote = "We have to choose to be the good guys even when it’s hard.",
            quoteTime = "MICHONNE, SEASON 10. EPISODE 1",
            rating = 4.6,
        ),
        Character(
            id = 3,
            name = "Daryl Dixon",
            realName = "Norman Reedus",
            about = "A man of few words, Daryl is forthright, weary, guarded, and most of all, strategic. His nomadic nature allows him to navigate the familiar and unfamiliar. The divide with Carol is an issue they must address, but food and supplies take precedence. A word to the wise – never mess with his dog.",
            totalAppearances = 148,
            image = "images/daryl.jpg",
            quote = "We don't fight for revenge. We fight for our future.",
            quoteTime = "DARYL, SEASON 10, EPISODE 9",
            rating = 5.0,
        )
    )

    override val page2: List<Character> = listOf(
        Character(
            id = 4,
            name = "Negan Smith",
            realName = "Jeffrey Dean Morgan",
            about = "Negan secured a hard-earned place within the community, which Maggie threatens. He does not like her holding his fate. But this is about survival, and Negan knows how to survive.",
            totalAppearances = 64,
            image = "images/negan.jpg",
            quote = "You can breathe. You can blink. You can cry. Hell, they're all gonna be doing that.",
            quoteTime = "NEGAN, SEASON 6, EPISODE 16",
            rating = 5.0,
        ),
        Character(
            id = 5,
            name = "Shane Walsh",
            realName = "Jon Bernthal",
            about = "Shane is Rick's partner in the sheriff's department and best friend since high school. When the apocalypse occurs while Rick is in a coma, Shane helps save Lori and Carl by fleeing with them toward Atlanta. Shortly after the evacuation, Shane begins having an affair with Lori. When Rick finds them among a group of survivors outside Atlanta, Shane suddenly finds his affections for Lori unreciprocated and his status as the group’s de facto leader challenged. Shane’s frustrations over Rick’s leadership quickly surface and lead to tension between the partners. After a disagreement, Shane trains his shotgun on Rick’s back but stops short of firing. His relationship with Lori also quickly frays, especially after he assaults her one drunken night. “I have a few mistakes under my belt,” he later tells her, explaining his plan to leave the group. But Shane’s plans change after he commits murder to save Carl’s life, and then learns that Lori is pregnant. Believing himself to be the father, Shane pursues Lori anew, telling her that he – not Rick – is the only one capable of protecting her and Carl, and arguing that “What we had, it was real.” Shane tells Rick as much when the two are deciding what to do with a dangerous prisoner, Randall, which leads to a brutal fist-fight. “If you wanna kill me, you’re gonna have to do better,” Rick warns his partner afterward. Shane gets his chance a few days later when he leads Rick into the forest to track down Randall, who’s apparently escaped. (Shane has in fact killed Randall and staged the escape.) Raising his gun at Rick, Shane asserts that “Lori and Carl, they’ll get over you.” Rick slowly hands over his gun. As Shane momentarily looks down Rick stabs his partner in the heart. \"Damn you for making me do this,\" Rick yells as Shane collapses to the ground. \"This was you! Not me! You did this to us!\" Moments later, Shane rises as a walker and lumbers toward Rick. Carl, gun drawn, shoots Shane in the head.",
            totalAppearances = 22,
            image = "images/shane.jpg",
            quote = "If y'all wanna live, if y'all wanna survive, you gotta fight for it!",
            quoteTime = "SHANE, SEASON 2, EPISODE 7",
            rating = 4.8,
        ),
        Character(
            id = 6,
            name = "Maggie Rhee",
            realName = "Lauren Cohan",
            about = "While Maggie has blocked out the psychological horror of things seen and done in order to persevere, she is even more determined to fight for a future. A future for her son. But with the constant presence of Negan getting under her skin, does Maggie have as much control as she believes?",
            totalAppearances = 106,
            image = "images/maggie.jpg",
            quote = "Some people can be redeemed, but others can't.",
            quoteTime = "MAGGIE, SEASON 9, EPISODE 2",
            rating = 4.9,
        )
    )

    override val page3: List<Character> = listOf(
        Character(
            id = 7,
            name = "Carol Peletier",
            realName = "Melissa McBride",
            about = "Carol is steadfast in her priorities to help rebuild Alexandria and keep all within its walls protected and fed, but others see the means to survival differently. The strain between her and Daryl is on her mind as she continues to operate independently. She will always go to greater lengths to protect herself, her family, and her community.",
            totalAppearances = 125,
            image = "images/carol.jpg",
            quote = "Look at the flowers.",
            quoteTime = "CAROL, SEASON 4, EPISODE 14",
            rating = 4.7,
        ),
        Character(
            id = 8,
            name = "Glenn Rhee",
            realName = "Steven Yeun",
            about = "Glenn has fully “grown up” – he’s been through trauma after trauma and he’s come away stronger for it, picking up lessons from the people he’s lost along the way. Firmly cemented in his humanism, he’s wary of this new, brutal world and his place within it – especially with a child on the way.",
            totalAppearances = 74,
            image = "images/glenn.jpg",
            quote = "People you love, they made you who you are. They're still part of you. If you stop being you, that last bit of them that's still around inside, who you are, it's gone.",
            quoteTime = "GLENN, SEASON 6, EPISODE 9",
            rating = 4.7,
        ),
        Character(
            // todo
            id = 9,
            name = "Maggie Rhee",
            realName = "Lauren Cohan",
            about = "While Maggie has blocked out the psychological horror of things seen and done in order to persevere, she is even more determined to fight for a future. A future for her son. But with the constant presence of Negan getting under her skin, does Maggie have as much control as she believes?",
            totalAppearances = 106,
            image = "",
            quote = "Some people can be redeemed, but others can't.",
            quoteTime = "MAGGIE, SEASON 9, EPISODE 2",
            rating = 4.9,
        )
    )

    override val page4: List<Character> = listOf(
        Character(
            id = 10,
            name = "Negan Smith",
            realName = "Jeffrey Dean Morgan",
            about = "Negan secured a hard-earned place within the community, which Maggie threatens. He does not like her holding his fate. But this is about survival, and Negan knows how to survive.",
            totalAppearances = 64,
            image = "",
            quote = "You can breathe. You can blink. You can cry. Hell, they're all gonna be doing that.",
            quoteTime = "NEGAN, SEASON 6, EPISODE 16",
            rating = 5.0,
        ),
        Character(
            id = 11,
            name = "Shane Walsh",
            realName = "Jon Bernthal",
            about = "Shane is Rick's partner in the sheriff's department and best friend since high school. When the apocalypse occurs while Rick is in a coma, Shane helps save Lori and Carl by fleeing with them toward Atlanta. Shortly after the evacuation, Shane begins having an affair with Lori. When Rick finds them among a group of survivors outside Atlanta, Shane suddenly finds his affections for Lori unreciprocated and his status as the group’s de facto leader challenged. Shane’s frustrations over Rick’s leadership quickly surface and lead to tension between the partners. After a disagreement, Shane trains his shotgun on Rick’s back but stops short of firing. His relationship with Lori also quickly frays, especially after he assaults her one drunken night. “I have a few mistakes under my belt,” he later tells her, explaining his plan to leave the group. But Shane’s plans change after he commits murder to save Carl’s life, and then learns that Lori is pregnant. Believing himself to be the father, Shane pursues Lori anew, telling her that he – not Rick – is the only one capable of protecting her and Carl, and arguing that “What we had, it was real.” Shane tells Rick as much when the two are deciding what to do with a dangerous prisoner, Randall, which leads to a brutal fist-fight. “If you wanna kill me, you’re gonna have to do better,” Rick warns his partner afterward. Shane gets his chance a few days later when he leads Rick into the forest to track down Randall, who’s apparently escaped. (Shane has in fact killed Randall and staged the escape.) Raising his gun at Rick, Shane asserts that “Lori and Carl, they’ll get over you.” Rick slowly hands over his gun. As Shane momentarily looks down Rick stabs his partner in the heart. \"Damn you for making me do this,\" Rick yells as Shane collapses to the ground. \"This was you! Not me! You did this to us!\" Moments later, Shane rises as a walker and lumbers toward Rick. Carl, gun drawn, shoots Shane in the head.",
            totalAppearances = 22,
            image = "",
            quote = "If y'all wanna live, if y'all wanna survive, you gotta fight for it!",
            quoteTime = "SHANE, SEASON 2, EPISODE 7",
            rating = 4.8,
        ),
        Character(
            id = 12,
            name = "Maggie Rhee",
            realName = "Lauren Cohan",
            about = "While Maggie has blocked out the psychological horror of things seen and done in order to persevere, she is even more determined to fight for a future. A future for her son. But with the constant presence of Negan getting under her skin, does Maggie have as much control as she believes?",
            totalAppearances = 106,
            image = "",
            quote = "Some people can be redeemed, but others can't.",
            quoteTime = "MAGGIE, SEASON 9, EPISODE 2",
            rating = 4.9,
        )
    )

    override val page5: List<Character> = listOf(
        Character(
            id = 13,
            name = "Negan Smith",
            realName = "Jeffrey Dean Morgan",
            about = "Negan secured a hard-earned place within the community, which Maggie threatens. He does not like her holding his fate. But this is about survival, and Negan knows how to survive.",
            totalAppearances = 64,
            image = "",
            quote = "You can breathe. You can blink. You can cry. Hell, they're all gonna be doing that.",
            quoteTime = "NEGAN, SEASON 6, EPISODE 16",
            rating = 5.0,
        ),
        Character(
            id = 14,
            name = "Shane Walsh",
            realName = "Jon Bernthal",
            about = "Shane is Rick's partner in the sheriff's department and best friend since high school. When the apocalypse occurs while Rick is in a coma, Shane helps save Lori and Carl by fleeing with them toward Atlanta. Shortly after the evacuation, Shane begins having an affair with Lori. When Rick finds them among a group of survivors outside Atlanta, Shane suddenly finds his affections for Lori unreciprocated and his status as the group’s de facto leader challenged. Shane’s frustrations over Rick’s leadership quickly surface and lead to tension between the partners. After a disagreement, Shane trains his shotgun on Rick’s back but stops short of firing. His relationship with Lori also quickly frays, especially after he assaults her one drunken night. “I have a few mistakes under my belt,” he later tells her, explaining his plan to leave the group. But Shane’s plans change after he commits murder to save Carl’s life, and then learns that Lori is pregnant. Believing himself to be the father, Shane pursues Lori anew, telling her that he – not Rick – is the only one capable of protecting her and Carl, and arguing that “What we had, it was real.” Shane tells Rick as much when the two are deciding what to do with a dangerous prisoner, Randall, which leads to a brutal fist-fight. “If you wanna kill me, you’re gonna have to do better,” Rick warns his partner afterward. Shane gets his chance a few days later when he leads Rick into the forest to track down Randall, who’s apparently escaped. (Shane has in fact killed Randall and staged the escape.) Raising his gun at Rick, Shane asserts that “Lori and Carl, they’ll get over you.” Rick slowly hands over his gun. As Shane momentarily looks down Rick stabs his partner in the heart. \"Damn you for making me do this,\" Rick yells as Shane collapses to the ground. \"This was you! Not me! You did this to us!\" Moments later, Shane rises as a walker and lumbers toward Rick. Carl, gun drawn, shoots Shane in the head.",
            totalAppearances = 22,
            image = "",
            quote = "If y'all wanna live, if y'all wanna survive, you gotta fight for it!",
            quoteTime = "SHANE, SEASON 2, EPISODE 7",
            rating = 4.8,
        ),
        Character(
            id = 15,
            name = "Maggie Rhee",
            realName = "Lauren Cohan",
            about = "While Maggie has blocked out the psychological horror of things seen and done in order to persevere, she is even more determined to fight for a future. A future for her son. But with the constant presence of Negan getting under her skin, does Maggie have as much control as she believes?",
            totalAppearances = 106,
            image = "",
            quote = "Some people can be redeemed, but others can't.",
            quoteTime = "MAGGIE, SEASON 9, EPISODE 2",
            rating = 4.9,
        )
    )

    override suspend fun getAllCharacters(page: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(page)[PREV_PAGE_KEY],
            nextPage = calculatePage(page)[NEXT_PAGE_KEY],
            characters = characters[page]!!
        )
    }

    private fun calculatePage(page: Int): Map<String, Int?> {
        var prevPage: Int? = page
        var nextPage: Int? = page
        if (page in 1..4)
            nextPage = nextPage?.plus(1)
        if (page in 2..5)
            prevPage = prevPage?.minus(1)
        if (page == 1)
            prevPage = null
        if (page == 5)
            nextPage = null
        return mapOf(PREV_PAGE_KEY to prevPage, NEXT_PAGE_KEY to nextPage)
    }

    override suspend fun searchCharacters(name: String): ApiResponse {
        TODO("Not yet implemented")
    }
}