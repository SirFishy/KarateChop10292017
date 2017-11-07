import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Test

class BinarySearchTreeTest2 {
    @Test

    fun search() {
        val tree = BinarySearchTree2()
        Assert.assertThat(tree.chop(3, emptyList()), CoreMatchers.`is`(-1))
        Assert.assertThat(tree.chop(3, listOf(1)), CoreMatchers.`is`(-1))
        Assert.assertThat(tree.chop(1, listOf(1)), CoreMatchers.`is`(0))

        Assert.assertThat(tree.chop(1, listOf(1, 3, 5)), CoreMatchers.`is`(0))
        Assert.assertThat(tree.chop(3, listOf(1, 3, 5)), CoreMatchers.`is`(1))
        Assert.assertThat(tree.chop(0, listOf(1, 3, 5)), CoreMatchers.`is`(-1))
        Assert.assertThat(tree.chop(2, listOf(1, 3, 5)), CoreMatchers.`is`(-1))
        Assert.assertThat(tree.chop(4, listOf(1, 3, 5)), CoreMatchers.`is`(-1))
        Assert.assertThat(tree.chop(6, listOf(1, 3, 5)), CoreMatchers.`is`(-1))

        Assert.assertThat(tree.chop(1, listOf(1, 3, 5, 7)), CoreMatchers.`is`(0))
        Assert.assertThat(tree.chop(3, listOf(1, 3, 5, 7)), CoreMatchers.`is`(1))
        Assert.assertThat(tree.chop(5, listOf(1, 3, 5, 7)), CoreMatchers.`is`(2))
        Assert.assertThat(tree.chop(7, listOf(1, 3, 5, 7)), CoreMatchers.`is`(3))
        Assert.assertThat(tree.chop(0, listOf(1, 3, 5, 7)), CoreMatchers.`is`(-1))
        Assert.assertThat(tree.chop(2, listOf(1, 3, 5, 7)), CoreMatchers.`is`(-1))
        Assert.assertThat(tree.chop(4, listOf(1, 3, 5, 7)), CoreMatchers.`is`(-1))
        Assert.assertThat(tree.chop(6, listOf(1, 3, 5, 7)), CoreMatchers.`is`(-1))
        Assert.assertThat(tree.chop(8, listOf(1, 3, 5, 7)), CoreMatchers.`is`(-1))
    }
}