/*
 * Copyright (c) 2018. Fengguo Wei and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License v2.0
 * which accompanies this distribution, and is available at
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Detailed contributors are listed in the CONTRIBUTOR.md
 */

package org.argus.jawa.flow.dfa

import org.argus.jawa.flow.AlirNode
import org.argus.jawa.core.util.ISet

/**
 * Provide an Interface to let the developer get data facts corresponding
 * to each statement.
 * 
 * @author <a href="mailto:fgwei521@gmail.com">Fengguo Wei</a>
 */
trait DataFlowAnalysisResult[N <: AlirNode, LatticeElement] {
  def entrySet: N => ISet[LatticeElement]
}
