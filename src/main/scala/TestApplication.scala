import org.slf4j.LoggerFactory

object TestApplication {
  private val LOGGER = LoggerFactory.getLogger(getClass.getName)

  def main(args: Array[String]): Unit = {
    LOGGER.info("Test logging.")
  }

  def sampleMethod(str: String): Unit = {}

  def returnTrue(): Boolean = {
      return true
  }
}
