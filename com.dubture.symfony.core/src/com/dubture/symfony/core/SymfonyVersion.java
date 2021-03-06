/*******************************************************************************
 * This file is part of the Symfony eclipse plugin.
 * 
 * (c) Robert Gruendler <r.gruendler@gmail.com>
 * 
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 ******************************************************************************/
package com.dubture.symfony.core;

import java.util.HashMap;
import java.util.Map;




public enum SymfonyVersion {

	Symfony2_1_9("Symfony 2.1.9"),
	Symfony2_2_1("Symfony 2.2.1");
	
	private String alias;

	private static class Aliases {
		private static Map<String, SymfonyVersion> map = new HashMap<String, SymfonyVersion>();
	}

	SymfonyVersion(String alias) {
		this.alias = alias;
		Aliases.map.put(alias, this);
	}

	public String getAlias() {
		return alias;
	}

	public static SymfonyVersion byAlias(String alias) {
		return Aliases.map.get(alias);
	}

	public boolean isLessThan(SymfonyVersion SymfonyVersion) {
		return ordinal() < SymfonyVersion.ordinal();
	}

	public boolean isGreaterThan(SymfonyVersion SymfonyVersion) {
		return ordinal() > SymfonyVersion.ordinal();
	}
}
