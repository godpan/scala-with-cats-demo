package variance

import json.JsonAst.Json

trait JsonWriter[-A] {
  def write(value: A): Json
}
