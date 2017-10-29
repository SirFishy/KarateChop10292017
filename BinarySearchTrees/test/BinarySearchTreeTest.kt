import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.*
import org.junit.Assert
import org.junit.Test
import org.junit.Assert.assertThat

class BinarySearchTreeTest {

    @Test
    fun search() {
        val tree = BinarySearchTree()
        assertThat(tree.chop(3, emptyList()), `is`(-1))
        assertThat(tree.chop(3, listOf(1)), `is`(-1))
        assertThat(tree.chop(1, listOf(1)), `is`(0))

        assertThat(tree.chop(1, listOf(1, 3, 5)), `is`(0))
        assertThat(tree.chop(3, listOf(1, 3, 5)), `is`(1))
        assertThat(tree.chop(0, listOf(1, 3, 5)), `is`(-1))
        assertThat(tree.chop(2, listOf(1, 3, 5)), `is`(-1))
        assertThat(tree.chop(4, listOf(1, 3, 5)), `is`(-1))
        assertThat(tree.chop(6, listOf(1, 3, 5)), `is`(-1))

        assertThat(tree.chop(1, listOf(1, 3, 5, 7)), `is`(0))
        assertThat(tree.chop(3, listOf(1, 3, 5, 7)), `is`(1))
        assertThat(tree.chop(5, listOf(1, 3, 5, 7)), `is`(2))
        assertThat(tree.chop(7, listOf(1, 3, 5, 7)), `is`(3))
        assertThat(tree.chop(0, listOf(1, 3, 5, 7)), `is`(-1))
        assertThat(tree.chop(2, listOf(1, 3, 5, 7)), `is`(-1))
        assertThat(tree.chop(4, listOf(1, 3, 5, 7)), `is`(-1))
        assertThat(tree.chop(6, listOf(1, 3, 5, 7)), `is`(-1))
        assertThat(tree.chop(8, listOf(1, 3, 5, 7)), `is`(-1))


    }
}